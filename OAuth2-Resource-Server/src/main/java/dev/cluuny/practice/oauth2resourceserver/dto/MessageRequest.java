package dev.cluuny.practice.oauth2resourceserver.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageRequest {
    private String data;
}
