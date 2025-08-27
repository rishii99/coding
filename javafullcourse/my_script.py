import pandas as pd
import numpy as np

filename = "C:/Users/rishi/Downloads/automobileEDA.csv"
df = pd.read_csv(filename)
print(df.head(-20))
