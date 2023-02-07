package com.example.springbootexamplerestfulapi.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson() {
        return new PersonV1("Tamerlan Mustafayev");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson() {
        return new PersonV2(new Name("Muhammed", "Mustafayev"));
    }

    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getVersionOfRequestParameter() {
        return new PersonV1("Tamerlan Mustafayev");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfRequestParameter() {
        return new PersonV2(new Name("Muhammed", "Mustafayev"));
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getVersionOfRequestHeader() {
        return new PersonV1("Tamerlan Mustafayev");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfRequestHeader() {
        return new PersonV2(new Name("Muhammed", "Mustafayev"));
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getVersionOfAcceptHeader() {
        return new PersonV1("Tamerlan Mustafayev");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getSecondVersionOfAcceptHeader() {
        return new PersonV2(new Name("Muhammed", "Mustafayev"));
    }

}
