package w11_ai_topic_2_integrating_ai_tools;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.responses.Response;
import com.openai.models.responses.ResponseCreateParams;

import java.util.Scanner;

/*
 * System Instructions
 *
 * User prompt - input provided by the user.
 * System instructions - rules defined by the developer.
 *
 * System instructions customize AI behavior,
 * define its role and control response format.
 */

public class OpenAITutor {

    public static void main(String[] args) {

        OpenAIClient client = OpenAIOkHttpClient.fromEnv();
        Scanner scanner = new Scanner(System.in);

        // Define AI behavior
        String systemPrompt = """
                You are a Java programming tutor.
                Help students understand programming concepts.
                Do not provide complete solutions.
                Give hints and ask guiding questions.
                Keep responses short and simple.
                """;

        System.out.print("Ask your Java tutor: ");
        String userPrompt = scanner.nextLine();

        ResponseCreateParams params =
                ResponseCreateParams.builder()
                        .model("gpt-5-mini")
                        .instructions(systemPrompt)
                        .input(userPrompt)
                        .build();

        Response response = client.responses().create(params);

        response.output().stream()
                .flatMap(item -> item.message().stream())
                .flatMap(message -> message.content().stream())
                .flatMap(content -> content.outputText().stream())
                .forEach(text -> System.out.println(text.text()));

        scanner.close();
    }
}