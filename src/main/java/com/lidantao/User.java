package com.lidantao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Cola
 * @Date 2023年04月22日 23:07:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private String id;
    private String name;

}
