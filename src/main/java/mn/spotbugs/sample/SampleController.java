package mn.spotbugs.sample;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import javax.validation.Valid;

@Controller
public class SampleController {

    @Post
    public void echo(@Valid SampleDto sampleDto) {
        System.out.println(sampleDto.getMessage());
    }
}
