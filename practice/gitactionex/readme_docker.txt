In GitHub Actions, the native and recommended way to configure a MySQL database using Docker is by defining a Service Container. This automatically pulls the official MySQL Docker image and runs it as a sidecar container alongside your testing job.
Step-by-Step Configuration
To set this up, create or edit a workflow file (e.g., .github/workflows/test.yml) with the following configuration:
yaml
name: Run Tests with MySQL

on: [push, pull_request]

jobs:
  test:
    runs-on: ubuntu-latest

    # Define the MySQL service container
    services:
      mysql:
        image: mysql:8.0
        env:
          MYSQL_ROOT_PASSWORD: root_password
          MYSQL_DATABASE: my_test_db
        ports:
          - 33306:3306
        # Options to ensure MySQL is fully ready before tests run
        options: >-
          --health-cmd="mysqladmin ping"
          --health-interval=10s
          --health-timeout=5s
          --health-retries=5

    steps:
      - name: Checkout code
        uses: actions/checkout@v4

      - name: Verify MySQL Connection
        run: |
          sudo apt-get install -y mysql-client
          mysql -h 127.0.0.1 -P 33306 -u root -proot_password -e "SHOW DATABASES;"
Use code with caution.
Key Configuration Elements
Parameter	Configuration Goal	Reason / Best Practice
image	mysql:8.0 (or mysql:latest)	Pulls the official image directly from Docker Hub.
ports	33306:3306	Maps the container's inner port (3306) to an alternate host port (33306). This avoids port conflicts with any default MySQL services already installed on GitHub runner environments.
options	--health-cmd="..."	Acts as a health check. GitHub Actions waits for the MySQL initialization scripts to finish before firing subsequent job steps.
Connecting to the Container
How you connect depends on where your application code executes:
• From the Runner (Host Machine): If your tests run directly on the GitHub host (e.g., using native Node.js, Python, or Java scripts), connect using 127.0.0.1 and your mapped host port (e.g., 33306).
• From a Custom Docker Action: If your tests run inside another container in the same job, they share a network bridge. Connect using the service name as the hostname (mysql) over the default inner port (3306).
To help tailor this further, please share:
• The programming language/framework your project uses (e.g., Python/Django, Node.js, Spring Boot)
• Whether your tests need a specific initial database schema (.sql file) pre-loaded