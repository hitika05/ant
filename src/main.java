<project name="HelloWorldProject" default="run" basedir=".">
    
    <!-- Define where to place compiled files -->
    <property name="src.dir" value="src"/>
    <property name="build.dir" value="build"/>

    <!-- Task to clean build directory -->
    <target name="clean">
        <delete dir="${build.dir}"/>
    </target>

    <!-- Task to compile the Java program -->
    <target name="compile">
        <mkdir dir="${build.dir}"/>
        <javac srcdir="${src.dir}" destdir="${build.dir}" includeantruntime="false"/>
    </target>

    <!-- Task to run the compiled Java program -->
    <target name="run" depends="compile">
        <java classname="Main" fork="true">
            <classpath>
                <pathelement path="${build.dir}"/>
            </classpath>
        </java>
    </target>
</project>

