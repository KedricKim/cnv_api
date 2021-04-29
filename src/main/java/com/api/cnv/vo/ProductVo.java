package com.api.cnv.vo;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="tb_product")
public class ProductVo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    private String type;
    private String name;
    private String name_sub;
    private String discription;

    @Builder
    public ProductVo(String type, String name, String name_sub, String discription){
        this.type = type;
        this.name = name;
        this.name_sub = name_sub;
        this.discription = discription;
    }
}
