package com.smalik.sqldata;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min=2, max=30)
	private String name;
	
	@NotNull
    @Min(5)	
	private int age;

	@Nullable
    private String emoji;
}
