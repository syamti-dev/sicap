package com.ingresos.backend.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;

@SuppressWarnings("unchecked")
public class DaoUtil {
	
	
	@SuppressWarnings("rawtypes")
	public static void prepareToSave(Object object, Integer userId) {
		Class objectClass = object.getClass();
		
		try {
			
			Method setFlgDltMethod = objectClass.getMethod("setFdl", new Class[]{objectClass.getDeclaredField("fdl").getType()});
			Method setCreatedByUserMethod = objectClass.getMethod("setCbu", new Class[]{objectClass.getDeclaredField("cbu").getType()});
			Method setCreatedAtMethod = objectClass.getMethod("setCat", new Class[]{objectClass.getDeclaredField("cat").getType()});
			Method setLastUpdateUserMethod = objectClass.getMethod("setLuu", new Class[]{objectClass.getDeclaredField("luu").getType()});
			Method setUpdateAtMethod = objectClass.getMethod("setUat", new Class[]{objectClass.getDeclaredField("uat").getType()});
			
			setFlgDltMethod.invoke(object, new Object[]{false});
			setCreatedByUserMethod.invoke(object, new Object[]{userId});
			setUpdateAtMethod.invoke(object, new Object[]{Calendar.getInstance(DateFormatUtil.getDefaultLocale()).getTime()});
			setLastUpdateUserMethod.invoke(object, new Object[]{userId});
			setCreatedAtMethod.invoke(object, new Object[]{Calendar.getInstance(DateFormatUtil.getDefaultLocale()).getTime()});
		} 
		catch (NoSuchMethodException nsmex) {
			throw new RuntimeException(nsmex.getMessage());
		}
		catch (SecurityException sex) {
			throw new RuntimeException(sex.getMessage());
		}
		catch (NoSuchFieldException nsfex) {
			throw new RuntimeException(nsfex.getMessage());
		}
		catch (IllegalArgumentException iaex) {
			throw new RuntimeException(iaex.getMessage());
		} 
		catch (IllegalAccessException iaex) {
			throw new RuntimeException(iaex.getMessage());
		}
		catch (InvocationTargetException itex) {
			throw new RuntimeException(itex.getMessage());
		}
	}
	
	
	@SuppressWarnings("rawtypes")
	public static void prepareToUpdate(Object object, Integer userId){
		Class objectClass = object.getClass();
		try {
			Method setLastUpdateUserMethod = objectClass.getMethod("setLuu", new Class[]{objectClass.getDeclaredField("luu").getType()});
			Method setUpdateAtMethod = objectClass.getMethod("setUat", new Class[]{objectClass.getDeclaredField("uat").getType()});
			
			setLastUpdateUserMethod.invoke(object, new Object[]{userId});
			setUpdateAtMethod.invoke(object, new Object[]{Calendar.getInstance(DateFormatUtil.getDefaultLocale()).getTime()});
		} 
		catch (NoSuchMethodException nsmex) {
			throw new RuntimeException(nsmex.getMessage());
		}
		catch (SecurityException sex) {
			throw new RuntimeException(sex.getMessage());
		}
		catch (NoSuchFieldException nsfex) {
			throw new RuntimeException(nsfex.getMessage());
		}
		catch (IllegalArgumentException iaex) {
			throw new RuntimeException(iaex.getMessage());
		} 
		catch (IllegalAccessException iaex) {
			throw new RuntimeException(iaex.getMessage());
		}
		catch (InvocationTargetException itex) {
			throw new RuntimeException(itex.getMessage());
		}
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public static void prepareToDelete(Object object, Integer userId){
		
		Class objectClass = object.getClass();
		
		try {
			Method setFlagDeletedMethod = objectClass.getMethod("setFdl", new Class[]{objectClass.getDeclaredField("fdl").getType()});
			Method setLastUpdateUserMethod = objectClass.getMethod("setLuu", new Class[]{objectClass.getDeclaredField("luu").getType()});
			Method setUpdateAtMethod = objectClass.getMethod("setUat", new Class[]{objectClass.getDeclaredField("uat").getType()});
			
			setFlagDeletedMethod.invoke(object, new Object[]{true});
			setLastUpdateUserMethod.invoke(object, new Object[]{userId});
			setUpdateAtMethod.invoke(object, new Object[]{Calendar.getInstance(DateFormatUtil.getDefaultLocale()).getTime()});
			
		} 
		catch (NoSuchMethodException nsmex) {
			throw new RuntimeException(nsmex.getMessage());
		}
		catch (SecurityException sex) {
			throw new RuntimeException(sex.getMessage());
		}
		catch (NoSuchFieldException nsfex) {
			throw new RuntimeException(nsfex.getMessage());
		}
		catch (IllegalArgumentException iaex) {
			throw new RuntimeException(iaex.getMessage());
		} 
		catch (IllegalAccessException iaex) {
			throw new RuntimeException(iaex.getMessage());
		}
		catch (InvocationTargetException itex) {
			throw new RuntimeException(itex.getMessage());
		}
	}
	
	
}