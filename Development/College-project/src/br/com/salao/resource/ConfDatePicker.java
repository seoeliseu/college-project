package br.com.salao.resource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.scene.control.DatePicker;

public class ConfDatePicker {
	public static void setConfDatePicker(DatePicker dp) {
		String pattern = "dd/MM/yyyy";

		dp.setPromptText(pattern.toLowerCase());

		dp.setConverter(new javafx.util.StringConverter<LocalDate>() {
			DateTimeFormatter dateFormatter = DateTimeFormatter
					.ofPattern(pattern);

			@Override
			public String toString(LocalDate date) {
				if (date != null) {
					return dateFormatter.format(date);
				} else {
					return "";
				}
			}

			@Override
			public LocalDate fromString(String string) {
				if (string != null && !string.isEmpty()) {
					return LocalDate.parse(string, dateFormatter);
				} else {
					return null;
				}
			}
		});
	}
}
