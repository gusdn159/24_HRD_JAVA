import matplotlib.pyplot as plt
from sklearn import datasets
from sklearn.neighbors import KNeighborsClassifier

digits = datasets.load_digits()
from sklearn.model_selection import train_test_split
import numpy as np

(X_train, X_test, y_train, y_test) = train_test_split(np.array(digits.data), digits.target,
                                                      test_size=0.3, random_state=42)
k = 5
knn = KNeighborsClassifier(n_neighbors=k)
knn.fit(X_train, y_train)
predictions = knn.predict(X_test)
from sklearn.metrics import classification_report

print("EVALUATION ON TESTING DATA")
print(classification_report(y_test, predictions))
y_predict=knn.predict([X_test[10]])
plt.imshow(X_test[10].reshape(8,8),cmap=plt.cm.gray_r,interpolation='nearest')
plt.show()
print(y_predict)
print(y_test[10])
