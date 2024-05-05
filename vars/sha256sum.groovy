def call(protocol, someArg = "A-AARGHHH!!!") {
    response = sh(
        returnStdout: true,
        script: """
            echo -n "${someArg}" | sha256sum  | cut -d' '  -f1
        """
    )
    return response
}