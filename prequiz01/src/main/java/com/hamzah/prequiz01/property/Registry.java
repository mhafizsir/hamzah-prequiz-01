package com.hamzah.prequiz01.property;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Registry {

  private Users user;
  private PropertyParent property;
  private Integer unit;
}
