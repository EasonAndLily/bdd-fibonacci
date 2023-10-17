Feature: Calculate the Fibonacci Sequence

  Scenario Outline: Get the Fibonacci value with subscript
    Given subscript is <index>
    When get the fibonacci value
    Then the fibonacci value is <value>

  Examples:
    | index     | value |
    | 0         | 0     |
    | 1         | 1     |
    | 2         | 1     |
    | 3         | 2     |
    | 4         | 3     |
    | 5         | 5     |
    | 6         | 8     |
