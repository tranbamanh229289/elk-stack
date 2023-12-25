import json
import re
from elasticsearch import Elasticsearch

es = Elasticsearch(
    hosts=("http://localhost:9200"),
    basic_auth=("elastic", "Tranmanh229")
)

f = open('data_world_example.json')
data = json.load(f)
id = 0

for item in data:
    del item["_id"]
    del item["raw_content"]
    es.index(index="article", id=id, document=item)
    id = id + 1
