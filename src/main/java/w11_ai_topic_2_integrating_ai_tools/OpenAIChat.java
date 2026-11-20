package w11_ai_topic_2_integrating_ai_tools;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.responses.Response;
import com.openai.models.responses.ResponseCreateParams;

import java.util.Scanner;

/*
 * Conversations
 *
 * A conversation allows the AI to use previous messages
 * as context for the next response.
 *
 * Previous messages increase token usage.
 * previousResponseId connects requests in OpenAI API.
 */

public class OpenAIChat {

    public static void main(String[] args) {

        OpenAIClient client = OpenAIOkHttpClient.fromEnv();
        Scanner scanner = new Scanner(System.in);

        String previousResponseId = null;

        while (true) {

            System.out.print("You: ");
            String prompt = scanner.nextLine();

            // Allow the user to exit the conversation
            if (prompt.equalsIgnoreCase("exit")) {
                break;
            }

            var builder = ResponseCreateParams.builder()
                    .model("gpt-5-mini")
                    .input(prompt);

            // Include previous conversation context
            if (previousResponseId != null) {
                builder.previousResponseId(previousResponseId);
            }

            Response response = client.responses().create(builder.build());

            System.out.println("AI:");

            response.output().stream()
                    .flatMap(item -> item.message().stream())
                    .flatMap(message -> message.content().stream())
                    .flatMap(content -> content.outputText().stream())
                    .forEach(text -> System.out.println(text.text()));

            // Save the response ID for the next request
            previousResponseId = response.id();
        }

        scanner.close();
    }
}