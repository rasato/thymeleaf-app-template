package ch72.net.web;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by asato on 2016/07/28.
 */
@Data
public class CustomerForm {
    @NotNull
    @Size(min = 1, max = 127)
    private String firstName;
    @NotNull
    @Size(min = 1, max = 127)
    private String lastName;
}
