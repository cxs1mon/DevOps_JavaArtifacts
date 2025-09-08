# DevOps Artifacts
## Submodule verwenden
Ins Hauptprojekt:
`
    <repositories>
        <repository>
            <id>fileshare</id>
            <url>file:///C:/maven-repo</url>
            <releases><enabled>true</enabled></releases>
            <snapshots><enabled>true</enabled></snapshots>
        </repository>
    </repositories>
`
Ins Artefakt:
`
    <distributionManagement>
        <repository>
            <id>fileshare</id>
            <url>file:///C:/maven-repo</url>
        </repository>
        <snapshotRepository>
            <id>fileshare-snapshots</id>
            <url>file:///C:/maven-repo</url>
        </snapshotRepository>
    </distributionManagement>
`
Danach:
- Artefakt deployen mit Maven
- Im Hauptprojekt importieren mit den Werten vom pom.xml:

`
    <dependencies>
        <dependency>
            <groupId>ch.bbw.cs</groupId>
            <artifactId>devops</artifactId>
            <version>1.0.0</version>
        </dependency>
    </dependencies>
`
Und verwenden: <br>
`System.out.println(Text.hello())`