echo "=== Compiling old ==="
javac -d ./old/test/bin ./old/test/src/roulette/*.java ./old/test/src/util/*.java ./old/test/src/Main.java

echo "=== Compiling new ==="
javac -d ./new/bin ./new/src/roulette/*.java ./new/src/util/*.java ./new/src/Main.java

echo "=== Running old ==="
java -cp ./old/test/bin Main < ./old/test/in.txt > ./pre-out.txt

echo "=== Running new ==="
java -cp ./new/bin Main < ./old/test/in.txt > ./post-out.txt

echo "=== Diff ==="
if diff ./pre-out.txt ./post-out.txt > /dev/null; then
    echo "All checks passed!"
else
    diff ./pre-out.txt ./post-out.txt
fi
