package com.test.common.model.doms;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseModel {
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
