Python agentic AI example using Ollama Cloud
============================================

This example connects directly to Ollama's hosted API. It does not connect to a
local Ollama server and does not require a local model download.

The agent can call two Python tools:
- calculate: safely evaluates basic arithmetic (+, -, *, /)
- get_current_utc_time: returns the current UTC time

Setup
-----

1. Create an API key at https://ollama.com/settings/keys.
2. Install the Python dependency:

   python -m pip install -r requirements.txt

3. Set your API key in PowerShell:

   $env:OLLAMA_API_KEY = "your_ollama_api_key"

   Or in Bash:

   export OLLAMA_API_KEY="your_ollama_api_key"

4. Run the agent:

   python agent.py

For example, ask: "What is 19% of 245? Use the calculator and explain the
result." The model may call the calculator, receive the result, and then
respond. The agent allows multiple tool-call rounds and stops after six rounds.

By default the script uses the cloud model `gpt-oss:120b`. To select another
model available through the Ollama Cloud API, set `OLLAMA_MODEL` before
starting the script. Keep your API key in an environment variable; do not add
it to source code or commit it.
