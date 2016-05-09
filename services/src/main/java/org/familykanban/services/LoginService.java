package org.familykanban.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Paul on 5/5/2016.
 */

@RestController
public class LoginService {

    @RequestMapping("/")
    public String getPage() {
        return "";
    }

}
