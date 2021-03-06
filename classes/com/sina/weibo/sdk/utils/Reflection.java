package com.sina.weibo.sdk.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection
{
  public static Object getByArray(Object paramObject, int paramInt)
  {
    return Array.get(paramObject, paramInt);
  }
  
  public static Object getProperty(Object paramObject, String paramString)
  {
    return paramObject.getClass().getField(paramString).get(paramObject);
  }
  
  public static Object getStaticProperty(String paramString1, String paramString2)
  {
    paramString1 = Class.forName(paramString1);
    return paramString1.getField(paramString2).get(paramString1);
  }
  
  public static Object invokeMethod(Object paramObject, String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      paramObject = paramObject.getClass().getMethod(paramString, paramArrayOfClass).invoke(paramObject, paramArrayOfObject);
      return paramObject;
    }
    catch (SecurityException paramObject)
    {
      ((SecurityException)paramObject).printStackTrace();
      return null;
    }
    catch (NoSuchMethodException paramObject)
    {
      for (;;)
      {
        ((NoSuchMethodException)paramObject).printStackTrace();
      }
    }
    catch (IllegalArgumentException paramObject)
    {
      for (;;)
      {
        ((IllegalArgumentException)paramObject).printStackTrace();
      }
    }
    catch (IllegalAccessException paramObject)
    {
      for (;;)
      {
        ((IllegalAccessException)paramObject).printStackTrace();
      }
    }
    catch (InvocationTargetException paramObject)
    {
      for (;;)
      {
        ((InvocationTargetException)paramObject).printStackTrace();
      }
    }
  }
  
  public static Object invokeMethod(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    Class localClass = paramObject.getClass();
    Class[] arrayOfClass = new Class[paramArrayOfObject.length];
    int i = 0;
    int j = paramArrayOfObject.length;
    for (;;)
    {
      if (i >= j) {
        return localClass.getMethod(paramString, arrayOfClass).invoke(paramObject, paramArrayOfObject);
      }
      arrayOfClass[i] = paramArrayOfObject[i].getClass();
      i += 1;
    }
  }
  
  public static Object invokeParamsMethod(Object paramObject, String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    paramString = paramObject.getClass().getMethod(paramString, paramArrayOfClass);
    paramString.setAccessible(true);
    return paramString.invoke(paramObject, paramArrayOfObject);
  }
  
  public static Object invokeStaticMethod(Class paramClass, String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      paramClass = paramClass.getMethod(paramString, paramArrayOfClass).invoke(null, paramArrayOfObject);
      return paramClass;
    }
    catch (SecurityException paramClass)
    {
      paramClass.printStackTrace();
      return null;
    }
    catch (NoSuchMethodException paramClass)
    {
      paramClass.printStackTrace();
      return null;
    }
    catch (IllegalArgumentException paramClass)
    {
      paramClass.printStackTrace();
      return null;
    }
    catch (IllegalAccessException paramClass)
    {
      paramClass.printStackTrace();
      return null;
    }
    catch (InvocationTargetException paramClass)
    {
      paramClass.printStackTrace();
    }
    return null;
  }
  
  public static Object invokeStaticMethod(String paramString1, String paramString2, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      paramString1 = Class.forName(paramString1).getMethod(paramString2, paramArrayOfClass).invoke(null, paramArrayOfObject);
      return paramString1;
    }
    catch (ClassNotFoundException paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    catch (SecurityException paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    catch (NoSuchMethodException paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    catch (IllegalArgumentException paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    catch (IllegalAccessException paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    catch (InvocationTargetException paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  public static Object invokeStaticMethod(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    paramString1 = Class.forName(paramString1);
    Class[] arrayOfClass = new Class[paramArrayOfObject.length];
    int i = 0;
    int j = paramArrayOfObject.length;
    for (;;)
    {
      if (i >= j) {
        return paramString1.getMethod(paramString2, arrayOfClass).invoke(null, paramArrayOfObject);
      }
      arrayOfClass[i] = paramArrayOfObject[i].getClass();
      i += 1;
    }
  }
  
  public static void invokeVoidMethod(Object paramObject, String paramString, boolean paramBoolean)
  {
    try
    {
      paramObject.getClass().getMethod(paramString, new Class[] { Boolean.TYPE }).invoke(paramObject, new Object[] { Boolean.valueOf(paramBoolean) });
      return;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}catch (IllegalArgumentException paramObject) {}catch (NoSuchMethodException paramObject) {}catch (SecurityException paramObject) {}
  }
  
  public static boolean isInstance(Object paramObject, Class paramClass)
  {
    return paramClass.isInstance(paramObject);
  }
  
  public static Object newInstance(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    return Class.forName(paramString).getConstructor(paramArrayOfClass).newInstance(paramArrayOfObject);
  }
}


/* Location:              E:\apk\xiaoenai2\classes-dex2jar.jar!\com\sina\weibo\sdk\utils\Reflection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */