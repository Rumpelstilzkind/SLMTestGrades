package at.fhtw.bic.slmtestgrades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {

    @GetMapping("/api/mark")
    public int returnGrades(@RequestParam int relative) {
        if (relative >= 88) {
            return 1;
        } else if (relative >= 75) {
            return 2;
        } else if (relative >= 63) {
            return 3;
        } else if (relative >= 50) {
            return 4;
        } else if ( relative >= 0 && relative < 50) {
            return 5;
        } else {
            return 0;
        }
    }


}
