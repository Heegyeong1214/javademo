package java024_lombok.part04;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@AllArgsConstructor
@ToString
@NoArgsConstructor
public class UserDTO {
  @NonNull	
  private String id;
  private String pwd;
}
