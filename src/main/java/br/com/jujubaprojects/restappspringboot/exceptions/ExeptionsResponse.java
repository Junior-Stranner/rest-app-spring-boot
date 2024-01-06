package br.com.jujubaprojects.restappspringboot.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExeptionsResponse implements Serializable{
    
    private static final long SerializableUID = 1L;

   private Date timestamp;
   private String message;
   private String details;
   
public ExeptionsResponse(Date timestamp, String message, String details) {
    this.timestamp = timestamp;
    this.message = message;
    this.details = details;
}

public Date getTimestamp() {
    return timestamp;
}

public String getMessage() {
    return message;
}

public String getDetails() {
    return details;
}
   
   
}
