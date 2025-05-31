package string;

public class StringReverser {

    public static String reverseString(String str) {
        String[] temp = str.split(" ");
        String swap = "";

        for (int i = temp.length - 1; i >= 0; i--) {
            swap += temp[i] + " ";
        }

        return swap.trim();  // Remove trailing space
    }

    public static void main(String[] args) {
        String str = "virat kohli";
        System.out.println(reverseString(str));  // Output: kohli virat
    }
}



/*
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    // Assume userService and User class already exist
    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        userService.save(user);  // Assuming userService exists
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}



*/