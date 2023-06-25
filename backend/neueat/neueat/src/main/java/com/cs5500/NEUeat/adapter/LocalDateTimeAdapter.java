package com.cs5500.NEUeat.adapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAdapter extends TypeAdapter<LocalDateTime> {

  private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

  @Override
  public void write(JsonWriter out, LocalDateTime value) throws IOException {
    if (value != null) {
      out.value(formatter.format(value));
    } else {
      out.nullValue();
    }
  }

  @Override
  public LocalDateTime read(JsonReader in) throws IOException {
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return null;
    }
    String value = in.nextString();
    if (value != null && !value.isEmpty()) {
      return LocalDateTime.parse(value, formatter);
    }
    return null;
  }
}