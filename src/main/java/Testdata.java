import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;


public class Testdata {
    public static void main(String[] args) {
        //Create a Mono with a msg.
        //.map is an Operator to manipulate the string
        //.log traces the details
        Mono<String> message$ = Mono.just("Welcome to RP")
                .map(msg -> msg.concat("rograming")).log();
        message$.subscribe(System.out::println);

    }
}
