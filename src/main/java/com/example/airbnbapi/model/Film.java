package com.example.airbnbapi.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "films")

public class Film extends Media{

}
