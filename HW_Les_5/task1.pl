domains
  list=i*
  i=integer
predicates
  sum_list(list,i)
goal
  write("‘список [4,6,8,10]"),nl,
  sum_list([4,6,8,10],X),
  write("‘сумма элементов списка  = ",X).  
clauses
  sum_list([],0).
  sum_list([H|T],Sum):-
    sum_list(T,Sum1),
    Sum=H+Sum1.
