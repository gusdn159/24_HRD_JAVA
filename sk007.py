import matplotlib.pyplot as plt
from sklearn import datasets
from sklearn.neighbors import KNeighborsClassifier
# load the MNIST digits dataset
digits = datasets.load_digits()
from sklearn.model_selection import train_test_split
import numpy as np
# print(digits)
# print(digits['data'])
# print(digits['target'])
# print(digits['feature_names'])
#
# digit = digits['data']
# label = digits['target']
#
# print(digits.images[0])
# print(label[0])
#
# plt.imshow(digits.images[0],cmap=plt.cm.gray_r,interpolation='nearest')
# # plt.show()
#
# n_images = len(digits.images)
# print(n_images)
# print(digits.images.shape)
# # data = digits.images.flatten()
# # print(data)
# # data = digits.images.reshape(1797,8*8)
# data = digits.images.reshape(1797,-1)
# print(data)
# print(data.shape)
# print(digits.data)


(X_train, X_test, y_train, y_test) = train_test_split(np.array(digits.data), digits.target,
test_size=0.3, random_state=42)
k = 5
knn = KNeighborsClassifier(n_neighbors=k)
predictions = knn.predict(X_test)