import requests
import urllib.parse

# url = input("Enter URL: ")
# response = requests.get(url)
# print(response.text)

#corrected code
ALLOWED_HOSTS = {"api.something.com", "safe.org"}

def safe_get(url: str):
    parsed = urllib.parse.urlparse(url)
    host = parsed.hostname
    if not host or host.lower() not in ALLOWED_HOSTS:
        raise ValueError("Restricted")
    
    response = requests.get(url, timeout=5, allow_redirects=False)
    response.raise_for_status()
    print(response.text)
