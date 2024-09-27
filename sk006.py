dachshund_length=[77,78,85,83,73,77,73,80]
dachshund_height=[25,28,29,30,21,22,17,35]

samoyed_length = [75,77,86,86,79,83,83,88]
samoyed_height = [56,57,50,53,60,53,49,61]

# import matplotlib.pyplot as plt
# plt.scatter(dachshund_length,dachshund_height,c='c',marker=".")
# plt.scatter(samoyed_length,samoyed_height,c='r',marker="*")
# plt.show()

import numpy as np
d_data = np.column_stack((dachshund_length,dachshund_height))
s_data = np.column_stack((samoyed_length,samoyed_height))
d_label=np.zeros(len(d_data))
s_label=np.ones(len(s_data))

dogs=np.concatenate((d_data,s_data))
labels=np.concatenate((d_label,s_label))
print(dogs)
print(labels)


from  sklearn.neighbors import  KNeighborsClassifier
k = 3 # 3,5,7,9
knn = KNeighborsClassifier(n_neighbors=k)
knn.fit(dogs,labels)
new_dog =[[200,50]]
new_dog_predict = knn.predict(new_dog)
print(new_dog_predict)

