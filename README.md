OLogger
OLogger is a simple utility class for logging messages with different levels (log, error, info) in Java applications.

Usage
To use OLogger in your Java application, follow these steps:

Copy the OLogger.java file into your project's source code directory.

Import the OLogger class in your Java class:
**import ozaii.utils.logger.OLogger;**

Logging Methods:

log(String message): Logs a general message.
error(String message): Logs an error message.
info(String message): Logs an informational message.

Example usage:

OLogger.log("This is a log message.");
OLogger.error("This is an error message.");
OLogger.info("This is an info message.");

The log messages will be printed to the console with the corresponding level prefix:

[OZAII - LOGS]: Log messages
[OZAII - ERROR]: Error messages
[OZAII - INFO]: Info messages

License
This project is licensed under the MIT License. See the LICENSE file for more information.
