package com.example.remoteapis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/remote")
public class RemoteApisController {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/get")
    public Object getMoviesDetails(){
        String url = "https://api.themoviedb.org/3/movie/157336?api_key=6071630e362e5666af14b609c8ffa4f0";
        Object responseObject =restTemplate.getForObject(url,Object.class);
        return responseObject;
    }
    @GetMapping("/get-custom")
    public CustomMovies getcustomMoviesDetails(){
        String url = "https://api.themoviedb.org/3/movie/157336?api_key=6071630e362e5666af14b609c8ffa4f0";
        CustomMovies responseObject =restTemplate.getForObject(url,CustomMovies.class);
        return responseObject;
    }


}
