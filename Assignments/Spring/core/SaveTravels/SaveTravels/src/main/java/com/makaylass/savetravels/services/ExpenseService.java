package com.makaylass.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.makaylass.savetravels.models.Expense;
import com.makaylass.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
    // adding the model repository as a dependency
    private final ExpenseRepository expenseRepository;
    
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
    // returns all the expenses
    public List<Expense> allExpenses() {
        return expenseRepository.findAll();
    }
    // creates / edits an expense
    public Expense createExpense(Expense e) {
        return expenseRepository.save(e);
    }
    // deletes an expense
    public void deleteExpense(Long id) {
    	expenseRepository.deleteById(id);
    }
    // retrieves an expense
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
}

