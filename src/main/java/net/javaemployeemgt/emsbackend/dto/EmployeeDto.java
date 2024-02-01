package net.javaemployeemgt.emsbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.message.StringFormattedMessage;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//transfer data between client and the server.
//use  as a response for https request
public class EmployeeDto {
    private Long id;
    private String fristName;
    private String lastName;
    private String email;
}
