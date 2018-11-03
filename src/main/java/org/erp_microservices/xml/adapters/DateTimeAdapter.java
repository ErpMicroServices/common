package org.erp_microservices.xml.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAdapter extends XmlAdapter<String, ZonedDateTime> {

	public ZonedDateTime unmarshal(String v) {
		return ZonedDateTime.from(DateTimeFormatter.ISO_DATE_TIME.parse(v));
	}

	public String marshal(ZonedDateTime v) {
		return DateTimeFormatter.ISO_DATE_TIME.format(v);
	}

}
