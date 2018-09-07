package net.zhenglai.common;

import java.util.UUID;

public class RecordChangeModel<T> {
    private RecordChangeAction action;
    private T data;
    private UUID correlationId;
}
