package w11_ai_topic_2_integrating_ai_tools;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.responses.ResponseCreateParams;
import com.openai.models.responses.Response;

public class OpenAIExample {

    public static void main(String[] args) {

        // Create a client using OPENAI_API_KEY
        OpenAIClient client = OpenAIOkHttpClient.fromEnv();

        // Adding context helps the AI generate more relevant responses.
        String prompt = """
        We run a small jewelry store.
        Our customers are mostly local residents.
        Suggest 3 marketing strategies to attract new customers.
        Keep the response short.
        """;

        // Zero-shot: asking a question without examples.
        String zeroShot = """
        Suggest promotional gifts for a jewelry store.
        """;

        // One-shot: providing one example.
        String oneShot = """
        Suggest promotional gifts for a jewelry store.
        Last year we gave away jewelry cleaning cloths.
        They were very popular.
        """;

        // Few-shot: providing multiple examples.
        String fewShot = """
        Suggest promotional gifts for a jewelry store.
        Jewelry cleaning cloths were very popular.
        Pens were not popular.
        Jewelry travel boxes were popular but too expensive.
        """;

        // Configure the request
        ResponseCreateParams params =
                ResponseCreateParams.builder()
                        .model("gpt-5-mini")
                        .input(prompt)
                        .build();

        // Send the request to OpenAI
        Response response = client.responses().create(params);

        // Print the generated response
        response.output().stream()
                .flatMap(item -> item.message().stream())
                .flatMap(message -> message.content().stream())
                .flatMap(content -> content.outputText().stream())
                .forEach(text -> System.out.println(text.text()));

        // Display token usage
        response.usage().ifPresent(usage -> {
            System.out.println("Input tokens: " + usage.inputTokens());
            System.out.println("Output tokens: " + usage.outputTokens());
            System.out.println("Total tokens: " + usage.totalTokens());
        });
    }
}

//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