package com.example.learnversemobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnversemobile.popups.AlertDialogue

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SubjectFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class SubjectFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_subject, container, false)
        val composeView = view.findViewById<ComposeView>(R.id.compose_view)

        composeView.setContent {
            myScreen()
        }
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SubjectFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                SubjectFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }

    @Preview(showBackground = true)
    @Composable
    fun ShowMe() {
        myScreen()
    }


    @Composable
    fun myScreen():View {
        // Create a new LinearLayout or other suitable layout

        val context = LocalContext.current
        val layout = LinearLayout(context)
        layout.orientation = LinearLayout.VERTICAL

        var showing1  by remember { mutableStateOf(false) }
        val discussion1 = remember { mutableStateOf(
            AlertDialogue(
                alertType = R.drawable.baseline_insert_drive_file_24,
                alertTitle = "Discussion",
                alertContent = "1. Using this guide, you should be able to answer the following questions:\n" +
                        "a. Is the information I received factual or not?\n" +
                        "b. How am I going to evaluate whether something is factual or not?\n" +
                        "2. Take note of any concept, topic, or terminology that you are not familiar with. Use your decided platform for classroom communication to interact with your mentor and classmates, or schedule a mentoring session.\n" +
                        "3. Manage your time wisely so you can complete the readings and activity in this learner guide before the next synchronous session."
            ))}

        var showing2  by remember { mutableStateOf(false) }
        val submit1 = remember { mutableStateOf(
            AlertDialogue(
                alertType = R.drawable.baseline_book_24,
                alertTitle = "Output",
                alertContent = "Please submit your Worksheet #1 here"
            ))}

        var showing3  by remember { mutableStateOf(false) }
        val discussion2 = remember { mutableStateOf(
            AlertDialogue(
                alertType = R.drawable.baseline_insert_drive_file_24,
                alertTitle = "Discussion",
                alertContent = "1. Using this guide, you should be able to answer the following questions:\n" +
                        "a. Is the information I received factual or not?\n" +
                        "b. How am I going to evaluate whether something is factual or not?\n" +
                        "2. Take note of any concept, topic, or terminology that you are not familiar with. Use your decided platform for classroom communication to interact with your mentor and classmates, or schedule a mentoring session.\n" +
                        "3. Manage your time wisely so you can complete the readings and activity in this learner guide before the next synchronous session."
            ))}

        var showing4  by remember { mutableStateOf(false) }
        val submit2 = remember { mutableStateOf(
            AlertDialogue(
                alertType = R.drawable.baseline_book_24,
                alertTitle = "Discussion",
                alertContent = "Please submit your Worksheet #2 here"
            ))}

        var showing5  by remember { mutableStateOf(false) }
        val discussion3 = remember { mutableStateOf(
            AlertDialogue(
                alertType = R.drawable.baseline_insert_drive_file_24,
                alertTitle = "Discussion",
                alertContent = "1. Using this guide, you should be able to answer the following questions:\n" +
                        "a. Is the information I received factual or not?\n" +
                        "b. How am I going to evaluate whether something is factual or not?\n" +
                        "2. Take note of any concept, topic, or terminology that you are not familiar with. Use your decided platform for classroom communication to interact with your mentor and classmates, or schedule a mentoring session.\n" +
                        "3. Manage your time wisely so you can complete the readings and activity in this learner guide before the next synchronous session."
            ))}

        var showing6 by remember { mutableStateOf(false) }
        val submit3 = remember { mutableStateOf(
            AlertDialogue(
                alertType = R.drawable.baseline_book_24,
                alertTitle = "Output",
                alertContent = "Please submit your Worksheet #2 here"
            ))}



        LazyColumn {
            item {
                val isExpanded1 = remember { mutableStateOf(false) }
                ExpandableHeading(
                    title = "Week 1",
                    isExpanded = isExpanded1
                ) {
                    // Nested Headings for Main Heading 1
                    var isNestedExpanded1 = remember { mutableStateOf(false) }
                    ExpandableHeading(
                        title = "Discussion",
                        isExpanded = isNestedExpanded1
                    ) {
                        Box (
                            modifier = Modifier
                                .clickable {showing1 = true}
                                .fillMaxWidth()
                                .padding(24.dp,16.dp),
                        ) {
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.baseline_book_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                                Text(modifier = Modifier.padding(10.dp, 0.dp),
                                    text = "What to expect")
                            }
                        }
                    }

                    var isNestedExpanded2 = remember { mutableStateOf(false) }
                    ExpandableHeading(
                        title = "Output",
                        isExpanded = isNestedExpanded2
                    ) {
                        Box (
                            modifier = Modifier
                                .clickable {showing2 = true}
                                .fillMaxWidth()
                                .padding(24.dp,16.dp),
                        ) {
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.baseline_book_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                                Text(modifier = Modifier.padding(10.dp, 0.dp),
                                    text = "Worksheet #1")
                            }
                        }
                    }
                }
            }

            item {
                val isExpanded1 = remember { mutableStateOf(false) }
                ExpandableHeading(
                    title = "Week 2",
                    isExpanded = isExpanded1
                ) {
                    // Nested Headings for Main Heading 1
                    var isNestedExpanded1 = remember { mutableStateOf(false) }
                    ExpandableHeading(
                        title = "Discussion",
                        isExpanded = isNestedExpanded1
                    ) {
                        Box (
                            modifier = Modifier
                                .clickable {showing3 = true}
                                .fillMaxWidth()
                                .padding(24.dp,16.dp),
                        ) {
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.baseline_book_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                                Text(modifier = Modifier.padding(10.dp, 0.dp),
                                    text = "Whats next?")
                            }
                        }
                    }

                    var isNestedExpanded2 = remember { mutableStateOf(false) }
                    ExpandableHeading(
                        title = "Output",
                        isExpanded = isNestedExpanded2
                    ) {
                        Box (
                            modifier = Modifier
                                .clickable {showing4 = true}
                                .fillMaxWidth()
                                .padding(24.dp,16.dp),
                        ) {
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.baseline_book_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                                Text(modifier = Modifier.padding(10.dp, 0.dp),
                                    text = "Worksheet #2")
                            }
                        }
                    }
                }
            }

            item {
                val isExpanded1 = remember { mutableStateOf(false) }
                ExpandableHeading(
                    title = "Week 3",
                    isExpanded = isExpanded1
                ) {
                    // Nested Headings for Main Heading 1
                    var isNestedExpanded1 = remember { mutableStateOf(false) }
                    ExpandableHeading(
                        title = "Discussion",
                        isExpanded = isNestedExpanded1
                    ) {
                        Box (
                            modifier = Modifier
                                .clickable {showing5 = true}
                                .fillMaxWidth()
                                .padding(24.dp,16.dp),
                        ) {
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.baseline_book_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                                Text(modifier = Modifier.padding(10.dp, 0.dp),
                                    text = "What to do")
                            }
                        }
                    }

                    var isNestedExpanded2 = remember { mutableStateOf(false) }
                    ExpandableHeading(
                        title = "Output",
                        isExpanded = isNestedExpanded2
                    ) {
                        Box (
                            modifier = Modifier
                                .clickable {showing6 = true}
                                .fillMaxWidth()
                                .padding(24.dp,16.dp),
                        ) {
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.baseline_book_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                                Text(modifier = Modifier.padding(10.dp, 0.dp),
                                    text = "Worksheet #3")
                            }
                        }

                    }
                }
            }
        }

        if (showing1) { AlertDialogue(discussion1, onDismiss = {showing1 = false}) }
        if (showing2) { AlertDialogue(submit1, onDismiss = {showing2 = false})}

        if (showing3) { AlertDialogue(discussion2, onDismiss = {showing3 = false}) }
        if (showing4) { AlertDialogue(submit2, onDismiss = {showing4 = false}) }

        if (showing5) { AlertDialogue(discussion3, onDismiss = {showing5 = false}) }
        if (showing6) { AlertDialogue(submit3, onDismiss = {showing6 = false}) }



        return layout
    }

    @Composable
    fun ExpandableHeading(
        title: String,
        isExpanded: MutableState<Boolean>,
        content: @Composable () -> Unit
    ) {
        val iconResource =
            if (isExpanded.value) R.drawable.baseline_expand_less_24 else R.drawable.baseline_expand_more_24
        val rotationAngle by animateFloatAsState(
            targetValue = if (isExpanded.value) 180f else 0f
        )

        Column {
            Row(
                Modifier
                    .clickable {
                        println("Previous State: $isExpanded")
                        isExpanded.value = !isExpanded.value
                        println("New State: ${isExpanded.value}")
                    }
                    .padding(16.dp)
            ) {
                Text(
                    text = title,
                    modifier = Modifier.weight(1f)
                )
                Icon(
                    painter = painterResource(id = iconResource),
                    contentDescription = null,
                    modifier = Modifier.rotate(rotationAngle)
                )
            }

            AnimatedVisibility(visible = isExpanded.value) {
                Column {
                    content()
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }





}

