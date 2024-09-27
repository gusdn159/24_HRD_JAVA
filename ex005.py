import numpy as np
from sklearn.preprocessing import  MinMaxScaler

X = [174, 152, 138, 128, 186]
y = [71, 55, 46, 38, 88]
X = np.array(X)
y = np.array(y)
X_new = X[:, np.newaxis]
y_new = y[:, np.newaxis]
print(X_new)
print(y_new)

scaler = MinMaxScaler()
X = scaler.fit_transform(X_new)
y = scaler.fit_transform(y_new)
print(X)
print(y)

X = X.flatten()
y = y.flatten()
print(X)
print(y)
#초기화 : 0.0, 1.0
W = 1.0
b = 0.0
lr = 0.01
epochs = 1_000
n = len(X) #5
for _ in range(epochs):
    y_hat = W*X+b
    error = y_hat -y
    dW = (2/n)*sum(X*error)
    db = (2/n)*sum(error)
    W = W - lr*dW
    b = b - lr*db

print(f"W:{W},b:{b}")

from sklearn.linear_model import LinearRegression
regression = LinearRegression()
regression.fit(X_new,y_new)
print(f"W:{regression.coef_},b:{regression.intercept_}")