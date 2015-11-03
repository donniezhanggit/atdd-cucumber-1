Feature: Temperature Converter

Scenario:  Convert Freezing
Given Celsius is 0
When converted to Fahrenheit
Then result is 32

Scenario:  Convert Boiling
Given Celsius is 100
When converted to Fahrenheit
Then result is 212