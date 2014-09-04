package lambda;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

public class ReflectionClassPrinter {
	
	
	public String listClass(final Class<?> klass) {
		final StringBuilder builder = new StringBuilder();
		builder.append(Modifier.toString(klass.getModifiers()));
		builder.append(" ");
		builder.append(klass);
		if( klass.getSuperclass() != null)
		{
			builder.append(" extends ");
			builder.append(klass.getSuperclass().getSimpleName());
		}
		if( klass.getGenericInterfaces().length > 0) {
			builder.append(" implements ");
			boolean first = true;
			for(Class<?> implemented : klass.getInterfaces()){
				if(first)
					first = false;
				else
					builder.append(", ");
				builder.append(implemented.getSimpleName());
			}
		}
		builder.append(" {\n");
		for(final Field field : klass.getDeclaredFields()){
			builder.append('\t');
			builder.append(simplifyMemberString(field));
			builder.append('\n');
		}
		
		for(final Constructor<?> cons : klass.getDeclaredConstructors()) {
			builder.append('\t');
			builder.append(simplifyMemberString(cons));
			builder.append('\n');
		}
		for(final Method method : klass.getDeclaredMethods()){
			builder.append('\t');
			builder.append(simplifyMemberString(method));
			builder.append('\n');
		}
		builder.append('}');
			
		return builder.toString();
	}

	private String simplifyMemberString(Member member) {
		final String fullString = member.toString();
		//hack rely on printing functionality in reflection classes, but strip member class qualification from strings
		return fullString.replace(member.getDeclaringClass().getName() + '.', "");
	}
	
	
}
