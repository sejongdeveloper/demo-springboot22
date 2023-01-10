package me.whiteship.demospringboot22;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.util.unit.DataSize;

@ConstructorBinding
@ConfigurationProperties(prefix = "chicken")
@Getter
@AllArgsConstructor
public class ChickenProperties {
    private String name;
    private int count;
    private DataSize size;
}
