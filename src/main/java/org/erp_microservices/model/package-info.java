/**
 * @author Jim
 */
/**
 * @author Jim
 *
 */

@XmlJavaTypeAdapters({@XmlJavaTypeAdapter(type = java.time.ZonedDateTime.class, value = DateTimeAdapter.class)})
package org.erp_microservices.model;

import org.erp_microservices.xml.adapters.DateTimeAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

