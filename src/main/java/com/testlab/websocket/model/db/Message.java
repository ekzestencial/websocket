package com.testlab.websocket.model.db;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Message {

    @Id
    @GeneratedValue
    private Integer id;

    @NonNull
    private String name;

}
