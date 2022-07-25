#!/bin/bash

echo "Hello World"

cd eratosthenes || exit
pwd
NOW=$(date +"%Y-%m-%d-%H-%M")
TEST_DIR="${NOW}"
FILENAME="${TEST_DIR}/test"
mkdir "${TEST_DIR}"
echo "Recording data to $TEST_DIR"

limit=1000000

commands=("./erastosthenes"
#"python SetSieve.py"
"python Sieve2.py --limit ${limit}"
"python SieveOfErastosthenes.py --limit ${limit}"
"java SieveOfEratosthenes")
function start_tests() {
  for command in "${commands[@]}"; do
    echo "$command"
    CURR_TEST_NAME=$(command)
    test
done

}

function test() {
  FILENAME="${TEST_DIR}/${CURR_TEST_NAME}"
  echo "Test $CURR_TEST_NAME"
  echo "$command"
  echo "${FILENAME}-${command}"
  touch "${FILENAME}-${command}.txt"
  echo "$command" > "${FILENAME}-${command}.txt"
  eval "$(time $command >> "${FILENAME}-${command}.txt" 2>&1)"
}

start_tests