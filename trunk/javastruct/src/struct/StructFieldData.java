package struct;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import struct.Constants.Primitive;

public class StructFieldData {
	private Field field;
	private boolean requiresGetterSetter;
	private Method getter;
	private Method setter;
	private boolean arrayLengthMarker;
	private Field arrayWithDefinedLength;
	private Primitive type;
	
	
	public StructFieldData(Field field, boolean requiresGetterSetter,
			Method getter, Method setter, Primitive type, 
			boolean isArrayLenghtMarker, Field lengthDefinedArray) {
		super();
		this.field = field;
		this.requiresGetterSetter = requiresGetterSetter;
		this.getter = getter;
		this.setter = setter;
		this.type = type;
	}


	public Field getField() {
		return field;
	}


	public void setField(Field field) {
		this.field = field;
	}


	public boolean requiresGetterSetter() {
		return requiresGetterSetter;
	}


	public void setRequiresGetterSetter(boolean requiresGetterSetter) {
		this.requiresGetterSetter = requiresGetterSetter;
	}


	public Method getGetter() {
		return getter;
	}


	public void setGetter(Method getter) {
		this.getter = getter;
	}


	public Method getSetter() {
		return setter;
	}


	public void setSetter(Method setter) {
		this.setter = setter;
	}


	public boolean isArrayLengthMarker() {
		return arrayLengthMarker;
	}


	public void setArrayLengthMarker(boolean arrayLengthMarker) {
		this.arrayLengthMarker = arrayLengthMarker;
	}


	public Field getArrayField() {
		return arrayWithDefinedLength;
	}


	public void setArrayField(Field arrayField) {
		this.arrayWithDefinedLength = arrayField;
	}


	public Primitive getType() {
		return type;
	}


	public void setType(Primitive type) {
		this.type = type;
	}
	
}
