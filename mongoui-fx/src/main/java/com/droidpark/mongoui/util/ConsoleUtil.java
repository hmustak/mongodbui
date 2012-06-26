package com.droidpark.mongoui.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.scene.control.TextArea;

public class ConsoleUtil {

	private static TextArea textArea = null;
	private static SimpleDateFormat formatter = null;
	
	static {
		formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
	}
	
	public static void init(TextArea console) {
		textArea = console;
	}
	
	public static void echo(String text) {
		textArea.setText("[" + formatter.format(new Date())+ "] " + text + "\n\r" + textArea.getText());
	}
}