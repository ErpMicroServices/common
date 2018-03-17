package erp_microservices.jpa.converters;

import fj.data.Option;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.UUID;

@Converter(autoApply = true)
public class OptionToUuidConverter implements AttributeConverter<Option<UUID>, UUID> {
	/**
	 * Converts the value stored in the entity attribute into the
	 * data representation to be stored in the database.
	 *
	 * @param attribute the entity attribute value to be converted
	 * @return the converted data to be stored in the database column
	 */
	@Override
	public UUID convertToDatabaseColumn(final Option<UUID> attribute) {
		return attribute.toNull();
	}

	/**
	 * Converts the data stored in the database column into the
	 * value to be stored in the entity attribute.
	 * Note that it is the responsibility of the converter writer to
	 * specify the correct dbData type for the corresponding column
	 * for use by the JDBC driver: i.e., persistence providers are
	 * not expected to do such type conversion.
	 *
	 * @param dbData the data from the database column to be converted
	 * @return the converted value to be stored in the entity attribute
	 */
	@Override
	public Option<UUID> convertToEntityAttribute(final UUID dbData) {
		return Option.fromNull(dbData);
	}
}
