package hr.algebra.catan.Utils;

import javafx.scene.control.Alert;

import java.io.IOException;
import java.lang.reflect.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class ReflectionUtils {

    static public void generateDocReflection() {
        //C:\Users\ignac\Documents\GitHub\Catan\target
        String location = "C:\\Users\\ignac\\Documents\\GitHub\\Catan\\target\\classes\\hr\\algebra\\catan";

        StringBuilder allInfo = new StringBuilder();
        allInfo.append("<div>");

        try (Stream<Path> stream = Files.walk(Paths.get(location))) {
            List<String> filePathsList = stream.filter(Files::isRegularFile)
                    .map(Path::toString)
                    .filter(string -> string.endsWith(".class"))
                    .filter(string -> !string.endsWith("module-info.class"))
                    .toList();

            for(String path : filePathsList) {
                String[] pathTokens = path.split("classes");
                String secondToken = pathTokens[1].substring(1, pathTokens[1].lastIndexOf('.'));
                String fullyQualifiedName = secondToken.replace('\\', '.');

                Class<?> clazz = Class.forName(fullyQualifiedName.replace(".class", ""));

                StringBuilder classinfo = new StringBuilder();
                ReflectionUtils.readClassAndMembersInfo(clazz, classinfo);


                /*
                allInfo.append("<div class='class-info'>")
                        .append("<h2>").append(clazz.getSimpleName()).append("</h2>")
                        .append(classinfo)
                        .append("</div>");

                 */

                allInfo.append("<div class='class-info'>")
                        .append("<h2>").append(clazz.getSimpleName()).append("</h2>")
                        .append("<div class='methods'>")
                        .append("<h3>Methods</h3>")
                        .append("<ul>");

                // Append methods
                Method[] methods = clazz.getDeclaredMethods();
                for (Method method : methods) {
                    //get public or private
                    String modifierString = Modifier.toString(method.getModifiers());

                    //get return type
                    String returnTypeString = method.getReturnType().getSimpleName();

                    Parameter[] parameters = method.getParameters();
                    String parameterString = "(";
                    for(Parameter parameter: parameters){
                        parameterString += parameter.getType().getSimpleName();
                        parameterString += ",";
                    }
                    //parameterString = parameterString.substring(0, parameterString.length() - 2);
                    parameterString += ")";

                    allInfo.append("<li>").append(modifierString).append(" ").append(returnTypeString).append(" ").append(method.getName()).append(" ").append(parameterString).append("</li>");
                }

                allInfo.append("</ul>")
                        .append("</div>")
                        .append("<div class='fields'>")
                        .append("<h3>Fields</h3>")
                        .append("<ul>");


                // Append fields
                Field[] fields = clazz.getDeclaredFields();
                for (Field field : fields) {
                    //get private or public
                    String modifierString = Modifier.toString(field.getModifiers());

                    //get type
                    String fieldTypeString = field.getType().getSimpleName();

                    allInfo.append("<li>").append(modifierString).append(" ").append(fieldTypeString).append(" ").append(field.getName()).append("</li>");
                }

                allInfo.append("</ul>")
                        .append("</div>")
                        .append("</div>");
            }


            allInfo.append("</div>");

            String basicHtml = """
                    <!DOCTYPE html>
                    <html>
                    <head>
                    <title>HTML documentation</title>
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                        }
                        .class-info {
                            border: 1px solid #ddd;
                            padding: 10px;
                            margin: 10px;
                        }
                    </style>
                    </head>
                    <body>
                    <h1>DOCUMENTATION CREATED</h1>
                    """;

            basicHtml += allInfo.toString();
            basicHtml += """
                    </body>
                    </html>
                    """;

            String path = "files/docs.html";

            Files.write(Paths.get(path), basicHtml.getBytes());

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Documentation generated successfully!");
            alert.setHeaderText(null);
            alert.setContentText("You have successfully generated the Documentation!");

            alert.showAndWait();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private ReflectionUtils() {
    }

    public static void readClassInfo(Class<?> clazz, StringBuilder classInfo) {
        appendPackage(clazz, classInfo);
        appendModifiers(clazz, classInfo);
        classInfo
                .append(" ")
                .append(clazz.getSimpleName());
        appendParent(clazz, classInfo, true);
        appendInterfaces(clazz, classInfo);
    }

    public static void appendPackage(Class<?> clazz, StringBuilder classInfo) {
        classInfo
                .append(clazz.getPackage())
                .append(System.lineSeparator()) // platform independent
                .append(System.lineSeparator());
    }

    public static void appendModifiers(Class<?> clazz, StringBuilder classInfo) {
        classInfo.append(Modifier.toString(clazz.getModifiers()));
    }

    public static void appendParent(Class<?> clazz, StringBuilder classInfo, boolean first) {
        Class<?> parent = clazz.getSuperclass();
        if(parent == null) {
            return;
        }
        classInfo
                .append(first ? " extends " : " -> ")
                .append(parent.getSimpleName());
        appendParent(parent, classInfo, false);
    }
    public static void appendInterfaces(Class<?> clazz, StringBuilder classInfo) {
        if (clazz.getInterfaces().length > 0) {
            classInfo
                    .append(" implements ")
                    .append(Stream.of(clazz.getInterfaces())
                            .map(Class::getSimpleName)
                            .collect(Collectors.joining(", ")));
        }
    }

    public static void readClassAndMembersInfo(Class<?> clazz, StringBuilder classAndMembersInfo) {
        readClassInfo(clazz, classAndMembersInfo);
        appendFields(clazz, classAndMembersInfo);
        appendMethods(clazz, classAndMembersInfo);
        appendConstructors(clazz, classAndMembersInfo);
    }
    private static void appendFields(Class<?> clazz, StringBuilder classAndMembersInfo) {
        //Field[] fields = clazz.getFields();
        Field[] fields = clazz.getDeclaredFields(); // no encapsulation in reflection!
        classAndMembersInfo
                .append(System.lineSeparator())
                .append(System.lineSeparator())
                .append(Stream.of(fields)
                        .map(Objects::toString)
                        .collect(Collectors.joining(System.lineSeparator())));
    }

    private static void appendMethods(Class<?> clazz, StringBuilder classAndMembersInfo) {
        Method[] methods = clazz.getDeclaredMethods();
        //iter tab tab
        for (Method method : methods) {
            classAndMembersInfo
                    .append(System.lineSeparator())
                    .append(System.lineSeparator());
            appendAnnotations(method, classAndMembersInfo);
            classAndMembersInfo
                    .append(System.lineSeparator())
                    .append(Modifier.toString(method.getModifiers()))
                    .append(" ")
                    .append(method.getReturnType())
                    .append(" ")
                    .append(method.getName());
            appendParameters(method, classAndMembersInfo);
            appendExceptions(method, classAndMembersInfo);
        }
    }

    private static void appendConstructors(Class<?> clazz, StringBuilder classAndMembersInfo) {
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            classAndMembersInfo
                    .append(System.lineSeparator())
                    .append(System.lineSeparator());
            appendAnnotations(constructor, classAndMembersInfo);
            classAndMembersInfo
                    .append(System.lineSeparator())
                    .append(Modifier.toString(constructor.getModifiers()))
                    .append(" ")
                    .append(constructor.getName());
            appendParameters(constructor, classAndMembersInfo);
            appendExceptions(constructor, classAndMembersInfo);
        }
    }


    private static void appendAnnotations(Executable executable, StringBuilder classAndMembersInfo) {
        classAndMembersInfo.append(
                Stream.of(executable.getAnnotations())
                        .map(Objects::toString)
                        .collect(Collectors.joining(System.lineSeparator())));
    }

    private static void appendParameters(Executable executable, StringBuilder classAndMembersInfo) {
        classAndMembersInfo.append(
                Stream.of(executable.getParameters())
                        .map(Objects::toString)
                        .collect(Collectors.joining(", ", "(", ")"))
        );
    }

    private static void appendExceptions(Executable executable, StringBuilder classAndMembersInfo) {
        if (executable.getExceptionTypes().length > 0) {
            classAndMembersInfo.append(
                    Stream.of(executable.getExceptionTypes())
                            .map(Class::getSimpleName)
                            .collect(Collectors.joining(", ", " throws ", ""))); // no String.empty like in C#
        }
    }
}
