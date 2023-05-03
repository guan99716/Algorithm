import random


def merge(arr1, arr2):
  result = []  # len(result) = len(arr1)+len(arr2)
  i, j = 0, 0
  while (i < len(arr1) and j < len(arr2)):
    if arr1[i] <= arr2[j]:
      result.append(arr1[i])
      i += 1
    else:
      result.append(arr2[j])
      j += 1
  while i < len(arr1):
    result.append(arr1[i])
    i += 1
  while j < len(arr2):
    result.append(arr2[j])
    j += 1
  return result


def mergesort(arr):
  if len(arr) < 2:
    return arr
  mid = len(arr) // 2
  leftarray = arr[0:mid]
  rightarray = arr[mid:len(arr)]
  return merge(mergesort(leftarray), mergesort(rightarray))


if __name__ == '__main__':
  arr = []
  for i in range(100):
    arr.append(random.randint(1, 100))
  res = mergesort(arr)
  print(res)
